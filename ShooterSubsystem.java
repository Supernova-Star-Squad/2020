/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class ShooterSubsystem extends SubsystemBase {
  /**
   * Creates a new ShooterSubsystem.
   */
  public ShooterSubsystem() {

  }

  public WPI_VictorSPX shooterController = new WPI_VictorSPX(RobotMap.shooterMotor);

  public void fire(){
     shooterController.set(RobotMap.shooterThrottle);    
  }

  public void unfire(){
    shooterController.set(-RobotMap.shooterThrottle);
  }
  
  public void stop(){
    shooterController.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
