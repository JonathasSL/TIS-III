����   4 �  Fornecedores/Cliente_CRUD2  java/lang/Object console Ljava/util/Scanner; arqClientes LFornecedores/Arquivo2; 	Signature 0LFornecedores/Arquivo2<LFornecedores/Cliente2;>; arqForn LFornecedores/Arquivo; 3LFornecedores/Arquivo<LFornecedores/Fornecedores;>; <clinit> ()V Code  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     <init> (Ljava/io/InputStream;)V	     LineNumberTable LocalVariableTable
  "   this LFornecedores/Cliente_CRUD2; main ([Ljava/lang/String;)V ( Fornecedores/Arquivo * Fornecedores/Fornecedores , java/lang/Class
 + . / 0 getConstructor 3([Ljava/lang/Class;)Ljava/lang/reflect/Constructor; 2 fornecedores.db
 ' 4  5 4(Ljava/lang/reflect/Constructor;Ljava/lang/String;)V	  7   9 Fornecedores/Arquivo2 ; Fornecedores/Cliente2 = clientes.db
 8 4	  @   B Fornecedores/Menu
 A "
 A E F G 
setVisible (Z)V
 I K J java/lang/Exception L  printStackTrace args [Ljava/lang/String; i LFornecedores/Menu; e Ljava/lang/Exception; StackMapTable listarClientes 
Exceptions
 8 W X Y listar ()[Ljava/lang/Object;	  [ \ ] out Ljava/io/PrintStream; _ 
LISTA DE CLIENTES
 a c b java/io/PrintStream d e println (Ljava/lang/String;)V
 a g d h (Ljava/lang/Object;)V
  j k  pausa obj [Ljava/lang/Object; I m incluirCliente 9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
 : s  t :(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
 8 v w x incluir (LFornecedores/Entidade2;)I nome Ljava/lang/String; telefone email LFornecedores/Cliente2; id alterarCliente � 
ALTERAÇÃO DE CLIENTE � Nome do Cliente: 
 a � � e print
  � � � nextLine ()Ljava/lang/String;
 � � � java/lang/String � � length ()I
 8 � � � buscar ,(Ljava/lang/String;)LFornecedores/Entidade2; � 
Novo nome:  � Novo telefone:  � Novo email:  � 
Confirma alteração?  � S - Sim � N - Não � 	Opção: 
 � � � � charAt (I)C	 : � y z	 : � { z	 : � | z
 8 � � � alterar (LFornecedores/Entidade2;)Z � Cliente alterado. � Cliente não pode ser alterado. � Cliente não encontrado newNome confirma C excluirCliente
 8 � � � excluir (Ljava/lang/String;)Z buscarCliente � 
BUSCA DE CLIENTE POR NOME � Nome:  � #
Pressione ENTER para continuar ... 
SourceFile Cliente_CRUD2.java !      
     
    	    
 
    	     	        2      � Y� � � �       
      
               /     *� !�                     # $   	 % &     �     @� 'Y)� +� -1� 3� 6� 8Y:� +� -<� >� ?� AY� CL+� D� L+� H�    7 : I            *  2  7 1 ; 2 ? 4          @ M N   2  O P  ;  Q R  S    z I 	 T   U     I    �     -� ?� VK� Z^� `<� � Z*2� :� f�*���� i�           9  ;  <  =   < ) ? , A        & l m     O n  S   
 �  o 	 p q  U     I    p     � :Y*+,� rN� ?-� u6�           W  X  ]     4     y z      { z     | z   
 l }    ~ n  	    U     I   �    � Z�� `� Z�� �� � �K*� �� �� ?*� �� :YL� � Z+� f� Z�� �� � �M� Z�� �� � �N� Z�� �� � �:,� �� -� �� � �� �� Z�� `� Z�� `� Z�� `� Z�� �� � �� �6s� 
S� f+,� �� ,� +� �� �+-� �� -� +� �� �+� �� � +� �� �� ?+� �� � Z�� `� � Z�� `� � Z�� `� i�       z    b  e  f  g  h  k . l 5 r = s D t L u S v [ w c y y z � { � | � } � ~ �  � � � � � � � � � � � � � � �     >   y z   + � l }  D � � z  S � { z  c � | z  � f � �  S   � �  �� Y  � : � � �  � 9K :�   � : � � �  : �N :�   � : � � �  : �P :�   � : � � �  : �� 
  � :   	 � e  U     I    7     	� ?*� �W�       
    �  �         	 y z   	 �   U     I    �     D� Z�� `� Z¶ �� � �K*� �� �� ?*� �� :YL� � Z+� f� � Z�� `� i�       * 
   �  �  �  �  �  � . � 8 � @ � C �        - y z   +  l }  S    �  ��  : 	 k   U     I    8      � ZĶ `� � �W�           �  �  �         �    �