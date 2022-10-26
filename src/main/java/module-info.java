module com.witshells.aisnake {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.witshells.aisnake to javafx.fxml;
    exports com.witshells.aisnake;
}