module com.mp3_q1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.mp3_q1 to javafx.fxml;
    exports com.mp3_q1;
    exports com.mp3_q1.Mass;
    opens com.mp3_q1.Mass to javafx.fxml;
    exports com.mp3_q1.Temperature;
    opens com.mp3_q1.Temperature to javafx.fxml;
}