
module com.example.assigenment1pro {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.fxmisc.richtext;
    requires javafx.base;
    requires java.desktop;

    requires flowless;
    requires reactfx;
    requires dom4j;

    requires pdfbox;



    opens com.example.assigenment1pro to javafx.fxml;
    exports com.example.assigenment1pro;
}