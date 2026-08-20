Что такое JVM?

    JVM — это виртуальная машина Java, которая выполняет Java bytecode.
    Она отвечает за запуск Java-программ и предоставляет среду выполнения,
    благодаря чему bytecode может работать на разных операционных системах.

Что такое JDK?

    JDK — это Java Development Kit, набор инструментов для разработки Java-приложений.
    В него входит JVM и такие инструменты, как компилятор javac.

что делает javac?

       javac — это компилятор Java.

       Main.java
          │
          │ javac
          ↓
       Main.class(внутри bytecode)
          │
          │ JVM
          ↓
       Программа работает

       Важный момент
       javac не выполняет программу.
       Он её компилирует.
       А выполняет её JVM.


что такое bytecode?

    Bytecode — это промежуточное представление Java-программы,
    которое создаётся компилятором javac и выполняется JVM.

что такое main()?

    main() — это точка входа в обычное Java-приложение.
    Когда JVM запускает класс как приложение, она ищет метод:

    public static void main(String[] args)



    1. Ты пишешь
           ↓
       Main.java

    2. javac компилирует
           ↓
       Main.class

    3. Внутри находится bytecode
           ↓
       JVM загружает его

    4. JVM ищет main()
           ↓
       public static void main(String[] args)

    5. JVM начинает выполнение
           ↓
       System.out.println(...)