package org.amm.dp.budai.structural.proxy;

import java.util.Random;

public class RobotBombDefuser {
	
	private Random _random = new Random();
	private int _robotConfiguredWavelength = 41;
	private boolean _isConnected = false;

	public void ConnectWireless(int communicationWaveLength) {
		if (communicationWaveLength == _robotConfiguredWavelength) {
			_isConnected = IsConnectedImmitatingConnectivitiyIssues();
		}
	}

	public boolean IsConnected() {
		_isConnected = IsConnectedImmitatingConnectivitiyIssues();
		return _isConnected;
	}

	private boolean IsConnectedImmitatingConnectivitiyIssues() {
		return _random.nextInt(10) < 4; // immitates 40% good connection, aka.
										// very bad
	}

	public void WalkStraightForward(int steps) {
		System.out.printf("Did %d steps forward...", steps);
	}

	public void TurnRight() {
		System.out.println("Turned right...");
	}

	public void TurnLeft() {
		System.out.println("Turned left...");
	}

	public void DefuseBomb() {
		System.out.println("Cut red or green or blue wire...");
	}
}
