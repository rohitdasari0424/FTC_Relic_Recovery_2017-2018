package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.hardware.Hardware;


/**
 * Created by Ramsey on 10/5/2017.
 */

public class Intake {

    DcMotor intake;

    public Intake (Hardware hardware) {
        //this.gamepad1 = gamepad1;
        //this.intake = hardware.intake;
    }


    public void intake() {
        intake.setPower(-1);
    }
    public void outtake() {
        intake.setPower(1);
    }
}