"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\javac" -classpath ".\postgresql-42.3.4.jar" .\database\DB.java
"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\javac" --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "." .\database\car.java
"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\javac" --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\controller\controller.java
"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\javac" --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\controller\controllerinsert.java
"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\javac" --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\controller\controllerupdate.java
"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\javac" --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\Main.java
"C:\Users\lloid\.jdks\openjdk-17.0.2\bin\java" --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path ".\postgresql-42.3.4.jar;..;.;" Main

pause
