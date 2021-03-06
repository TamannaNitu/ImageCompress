����   3 z
  F	  G H I J K 2 L
  M N O P Q R
  F S
  T
  U
  V
 
 W X
  F
  Y Z [ \
  ] J ^ _ ` a delegate $Ljava/util/concurrent/ConcurrentMap; 	Signature :Ljava/util/concurrent/ConcurrentMap<Ljava/lang/String;[B>; <init> '(Ljava/util/concurrent/ConcurrentMap;)V Code LineNumberTable LocalVariableTable this .Lorg/gradle/caching/MapBasedBuildCacheService; LocalVariableTypeTable =(Ljava/util/concurrent/ConcurrentMap<Ljava/lang/String;[B>;)V load O(Lorg/gradle/caching/BuildCacheKey;Lorg/gradle/caching/BuildCacheEntryReader;)Z e Ljava/io/IOException; key "Lorg/gradle/caching/BuildCacheKey; reader *Lorg/gradle/caching/BuildCacheEntryReader; bytes [B StackMapTable P 
Exceptions store O(Lorg/gradle/caching/BuildCacheKey;Lorg/gradle/caching/BuildCacheEntryWriter;)V output *Lorg/gradle/caching/BuildCacheEntryWriter; buffer )Lorg/gradle/internal/io/StreamByteBuffer; _ b c X close ()V 
SourceFile MapBasedBuildCacheService.java RuntimeVisibleAnnotations Lorg/gradle/api/Incubating;   A   b d e f g h java/io/ByteArrayInputStream   i j k l java/io/IOException &org/gradle/caching/BuildCacheException java/lang/StringBuilder loading  m n m o p e   q 'org/gradle/internal/io/StreamByteBuffer r s c t u storing  v w x y ,org/gradle/caching/MapBasedBuildCacheService java/lang/Object $org/gradle/caching/BuildCacheService  org/gradle/caching/BuildCacheKey (org/gradle/caching/BuildCacheEntryWriter getHashCode ()Ljava/lang/String; "java/util/concurrent/ConcurrentMap get &(Ljava/lang/Object;)Ljava/lang/Object; ([B)V (org/gradle/caching/BuildCacheEntryReader readFrom (Ljava/io/InputStream;)V append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; toString *(Ljava/lang/String;Ljava/lang/Throwable;)V getOutputStream ()Ljava/io/OutputStream; writeTo (Ljava/io/OutputStream;)V readAsByteArray ()[B put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; !                   !  "   X     
*� *+� �    #       #  $ 	 % $       
 % &     
    '       
        (  ) *  "   �     K*� +�  �  � N-� �,� Y-