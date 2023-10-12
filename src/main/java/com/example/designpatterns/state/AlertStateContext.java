package com.example.designpatterns.state;

import lombok.Setter;

public class AlertStateContext {
    @Setter
    private MobileAlertState state;


    public AlertStateContext() {
        state= new Vibration();
    }

    public void alert() {
        state.alert(this);
    }


}
