package Projeto;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;




/* String nome, String local, String descricao, String objetivo, String resumo, String justificativa, String democratizacao, String acessibilidade, int publicoEstimado, float orcamento */


public abstract class CRUDProjeto {
	private static final String NOME_ARQUIVO = "projects";

	//retorna true se foi possivel criar o projeto false se nao foi possivel
	public static boolean create(String nome, String local, String descricao, String objetivo,
			String resumo, String justificativa, String democratizacao, String acessibilidade, int publicoEstimado, float orcamento) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);

			Projeto projeto = new Projeto(nome);
			projeto.setLocal(local);
			projeto.setDescricao(descricao);
			projeto.setObjetivo(objetivo);
			projeto.setResumo(resumo);
			projeto.setJustificativa(justificativa);
			projeto.setDemocratizacao(democratizacao);
			projeto.setAcessibilidade(acessibilidade);
			projeto.setPublicoEstimado(publicoEstimado);
			projeto.setOrcamento(orcamento);


			if(!exist(projeto)) {
				output.println(projeto);
				output.close();
				file.close();
				return true;
			}

			output.close();
			file.close();
		} catch(FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return false;
	}

	public static boolean create(String nome, String local, String descricao, String objetivo,
			String resumo, String justificativa, String democratizacao, String acessibilidade, String publicoEstimado, String orcamento) {
		try {
			FileOutputStream file = new FileOutputStream(NOME_ARQUIVO,true);
			PrintStream output = new PrintStream(file);

			Projeto projeto = new Projeto(nome);
			projeto.setLocal(local);
			projeto.setDescricao(descricao);
			projeto.setObjetivo(objetivo);
			projeto.setResumo(resumo);
			projeto.setJustificativa(justificativa);
			projeto.setDemocratizacao(democratizacao);
			projeto.setAcessibilidade(acessibilidade);
			projeto.setPublicoEstimado(Integer.parseInt(publicoEstimado));
			projeto.setOrcamento(Float.parseFloat(orcamento));


			if(!exist(projeto)) {
				output.println(projeto);
				output.close();
				file.close();
				return true;
			}

			output.close();
			file.close();
		} catch(FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return false;
	}
	
	//checa se um projeto existe no arquivo
	public static boolean exist(Projeto project) {
		try {
			FileInputStream file = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(file);


			while(input.available() !=0) {
				StringTokenizer sToken = new StringTokenizer(input.readLine(),";");

				Projeto temp = new Projeto(sToken.nextToken());
				temp.setLocal(sToken.nextToken());
				temp.setDescricao(sToken.nextToken());
				temp.setObjetivo(sToken.nextToken());
				temp.setResumo(sToken.nextToken());
				temp.setJustificativa(sToken.nextToken());
				temp.setDemocratizacao(sToken.nextToken());
				temp.setAcessibilidade(sToken.nextToken());
				temp.setAcessibilidade(sToken.nextToken());
				temp.setPublicoEstimado(Integer.parseInt(sToken.nextToken()));
				temp.setOrcamento(Float.parseFloat(sToken.nextToken()));

				if(project.equals(temp)) {
					input.close();
					file.close();
					return true;
				}
			}
		} catch (NoSuchElementException e) {
			return false;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return false;
	}
	//checa se um projeto existe no arquivo	
	public static boolean exist(String nome) {
		try {
			FileInputStream file = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(file);

			while(input.available() !=0) {
				StringTokenizer sToken = new StringTokenizer(input.readLine(),";");

				Projeto temp = new Projeto(sToken.nextToken());
				//				temp.setLocal(sToken.nextToken());
				//				temp.setDescricao(sToken.nextToken());
				//				temp.setObjetivo(sToken.nextToken());
				//				temp.setResumo(sToken.nextToken());
				//				temp.setJustificativa(sToken.nextToken());
				//				temp.setDemocratizacao(sToken.nextToken());
				//				temp.setAcessibilidade(sToken.nextToken());
				//				temp.setAcessibilidade(sToken.nextToken());
				//				temp.setPublicoEstimado(Integer.parseInt(sToken.nextToken()));
				//				temp.setOrcamento(Float.parseFloat(sToken.nextToken()));

				if(nome.equalsIgnoreCase(temp.getNome())) {
					input.close();
					file.close();
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return false;
	}

	//retorna um projeto dado o seu nome
	public static Projeto retrieve(String nome) {
		if(exist(nome))
			try {
				FileInputStream file = new FileInputStream(NOME_ARQUIVO);
				DataInputStream input = new DataInputStream(file);

				while(input.available() != 0) {
					StringTokenizer sToken = new StringTokenizer(input.readLine(),";");

					Projeto temp = new Projeto(sToken.nextToken());

					if(nome.equalsIgnoreCase(temp.getNome())) {

						temp.setLocal(sToken.nextToken());
						temp.setDescricao(sToken.nextToken());
						temp.setObjetivo(sToken.nextToken());
						temp.setResumo(sToken.nextToken());
						temp.setJustificativa(sToken.nextToken());
						temp.setDemocratizacao(sToken.nextToken());
						temp.setAcessibilidade(sToken.nextToken());
						temp.setPublicoEstimado(Integer.parseInt(sToken.nextToken()));
						temp.setOrcamento(Float.parseFloat(sToken.nextToken()));

						input.close();
						file.close();
						return temp;
					}
				}

				input.close();
				file.close();
				return null;
			} catch(FileNotFoundException e) {
				return null;
			} catch (IOException e) {
				return null;
			}
		return null;
	}

	//retorna um vetor de projetos
	public static Projeto[] retrieveAll() {
		try {
			FileInputStream file = new FileInputStream(NOME_ARQUIVO);
			DataInputStream input = new DataInputStream(file);

			ArrayList<Projeto> list = new ArrayList<>();

			while(input.available() != 0) {
				StringTokenizer sToken = new StringTokenizer(input.readLine(),";");

				Projeto temp = new Projeto(sToken.nextToken());
				temp.setLocal(sToken.nextToken());
				temp.setDescricao(sToken.nextToken());
				temp.setObjetivo(sToken.nextToken());
				temp.setResumo(sToken.nextToken());
				temp.setJustificativa(sToken.nextToken());
				temp.setDemocratizacao(sToken.nextToken());
				temp.setAcessibilidade(sToken.nextToken());
				temp.setAcessibilidade(sToken.nextToken());
				temp.setPublicoEstimado(Integer.parseInt(sToken.nextToken()));
				temp.setOrcamento(Float.parseFloat(sToken.nextToken()));

				list.add(temp);
			}

			input.close();
			file.close();
			return (Projeto[]) list.toArray();

		} catch(FileNotFoundException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
	}

	public static boolean update(Projeto projeto,String nome, String local, String descricao, String objetivo,
			String resumo, String justificativa, String democratizacao, String acessibilidade, int publicoEstimado, float orcamento) {
		if(exist(projeto)) {
			delete(projeto);
			return create(nome,local,descricao,objetivo,resumo,justificativa,democratizacao,acessibilidade,publicoEstimado,orcamento);
		}
		return false;
	}

	public static boolean delete(Projeto projeto) {
		if(exist(projeto)) {
			try {
				FileInputStream file = new FileInputStream(NOME_ARQUIVO);
				DataInputStream input = new DataInputStream(file);

				FileOutputStream tempFile = new FileOutputStream("temp_"+NOME_ARQUIVO,false);
				PrintStream output = new PrintStream(tempFile);


				while(input.available() != 0) {
					StringTokenizer sToken = new StringTokenizer(input.readLine(),";");

					Projeto temp = new Projeto(sToken.nextToken());
					temp.setLocal(sToken.nextToken());
					temp.setDescricao(sToken.nextToken());
					//					temp.setObjetivo(sToken.nextToken());
					//					temp.setResumo(sToken.nextToken());
					//					temp.setJustificativa(sToken.nextToken());
					//					temp.setDemocratizacao(sToken.nextToken());
					//					temp.setAcessibilidade(sToken.nextToken());
					//					temp.setAcessibilidade(sToken.nextToken());
					//					temp.setPublicoEstimado(Integer.parseInt(sToken.nextToken()));
					//					temp.setOrcamento(Float.parseFloat(sToken.nextToken()));

					if(!temp.equals(projeto))
						output.println(input.readLine());
				}
				output.flush();
				output.close();
				tempFile.close();
				input.close();
				file.close();

				FileInputStream tempFile1 = new FileInputStream("temp_"+NOME_ARQUIVO);
				DataInputStream input1 = new DataInputStream(tempFile1);

				FileOutputStream file1 = new FileOutputStream(NOME_ARQUIVO,false);
				PrintStream output1 = new PrintStream(file1);

				while(input1.available() != 0)
					output1.println(input1.readLine());


				output1.close();
				file1.close();

				input1.close();
				tempFile1.close();

				return true;
			} catch (FileNotFoundException e) {
				return false;
			} catch (IOException e) {
				return false;
			}

		}
		return false;
	}

}
