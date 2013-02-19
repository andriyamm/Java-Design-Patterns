package org.amm.dp.budai.structural.proxy;

public class RobotBombDefuserProxy extends RobotBombDefuser {
	
	private RobotBombDefuser robotBombDefuser;
	private int communicationWaveLength;
	private int connectionAttempts = 3;

	public RobotBombDefuserProxy(int communicationWaveLength) {
		robotBombDefuser = new RobotBombDefuser();
		this.communicationWaveLength = communicationWaveLength;
	}

	@Override
	public void WalkStraightForward(int steps) {
		EnsureConnectedWithRobot();
		robotBombDefuser.WalkStraightForward(steps);
	}

	@Override
	public void TurnRight() {
		EnsureConnectedWithRobot();
		robotBombDefuser.TurnRight();
	}

	@Override
	public void TurnLeft() {
		EnsureConnectedWithRobot();
		robotBombDefuser.TurnLeft();
	}

	@Override
	public void DefuseBomb() {
		EnsureConnectedWithRobot();
		robotBombDefuser.DefuseBomb();
	}

	private void EnsureConnectedWithRobot() {
		if (robotBombDefuser == null) {
			robotBombDefuser = new RobotBombDefuser();
			robotBombDefuser.ConnectWireless(communicationWaveLength);
		}

		for (int i = 0; i < connectionAttempts; i++) {
			if (robotBombDefuser.IsConnected() != true) {
				robotBombDefuser.ConnectWireless(communicationWaveLength);
			} else {
				break;
			}
		}
		if (robotBombDefuser.IsConnected() != true) {
			throw new BadConnectionException(
					"No connection with remote bomb diffuser robot could be made after few attempts.");
		}
	}
}
