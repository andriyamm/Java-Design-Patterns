package org.amm.dp.budai.structural.proxy;

public class ProxyDemo
{
	public static void main(String[] args)
    {
        int opNum = 0;
        try
        {
        	RobotBombDefuserProxy proxy = new RobotBombDefuserProxy(41);
            proxy.WalkStraightForward(100);
            opNum++;
            proxy.TurnRight();
            opNum++;
            proxy.WalkStraightForward(5);
            opNum++;
            proxy.DefuseBomb();
            opNum++;

            System.out.println();
        }
        catch (BadConnectionException e)
        {
        	System.out.printf("Exception has been caught with message: (%s). Decided to have human operate robot there.", e.getMessage());

            PlanB(opNum);
        }
    }

    private static void PlanB(int nextOperationNum)
    {
        RobotBombDefuser humanOperatingRobotDirectly = new RobotBombDefuser();

        if (nextOperationNum == 0)
        {
            humanOperatingRobotDirectly.WalkStraightForward(100);
            nextOperationNum++;
        }
        if (nextOperationNum == 1)
        {
            humanOperatingRobotDirectly.TurnRight();
            nextOperationNum++;
        }
        if (nextOperationNum == 2)
        {
            humanOperatingRobotDirectly.WalkStraightForward(5);
            nextOperationNum++;
        }
        if (nextOperationNum == 3)
        {
            humanOperatingRobotDirectly.DefuseBomb();
        }
    }
}
