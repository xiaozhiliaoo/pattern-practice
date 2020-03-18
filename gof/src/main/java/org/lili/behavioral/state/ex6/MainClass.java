package org.lili.behavioral.state.ex6;

/**
 * Created by lili on 2017/8/5
 */
//状态机
public class MainClass {
    public static void main(String[] args) {

        Event doorClosed = new Event("doorClosed","DlCL");
        Event drawerOpened = new Event("drawerOpened","D2OP");
        Event lightOn = new Event("lightOn","L1ON");
        Event doorOpend = new Event("doorOpend","DlOP");
        Event panelClosed = new Event("panelClosed","PNCL");

        Command unlockPanelCmd = new Command("unlockPanelCmd","PNUL");
        Command lockPanelCmd = new Command("lockPanelCmd","PNLK");
        Command unlockDoorCmd = new Command("unlockDoorCmd","DlUL");
        Command lockDoorCmd = new Command("unlockPanelCmd","DlLK");

        State idle = new State("idle");
        State activeState = new State("active");
        State waitingForLightState = new State("waitingForLight");
        State waitingForDrawerState = new State("waitingForDrawer");
        State unlockedPanelState = new State("unlockedPanel");

        //开始状态
        StateMachine machine = new StateMachine(idle);
        idle.addTranstion(doorClosed,activeState);
//        idle.addAction(unlockDoorCmd);
//        idle.addAction(lockPanelCmd);
        //过渡transition
        activeState.addTranstion(drawerOpened,waitingForLightState);
        activeState.addTranstion(lightOn,waitingForDrawerState);
        waitingForLightState.addTranstion(lightOn,unlockedPanelState);
        waitingForDrawerState.addTranstion(drawerOpened,unlockedPanelState);
//        idle.addAction(unlockedPanelState);
//        idle.addAction(lockDoorCmd);

        unlockedPanelState.addTranstion(panelClosed,idle);
        machine.addResetEvents(doorOpend);

    }
}
