javac -classpath ".\postgresql-42.3.4.jar" .\database\database.java
javac --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "." .\database\car.java
javac --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\controller\controller.java
javac --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\controller\controllerinsert.java
javac --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\controller\controllerupdate.java
javac --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path "..;.;" .\Main.java
java --module-path .\libs\lib --add-modules=javafx.controls,javafx.fxml --class-path ".\postgresql-42.3.4.jar;..;.;" Main

pause
