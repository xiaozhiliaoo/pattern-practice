package org.lili.behavioral.state.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public abstract class DoorState extends DomainObject {
    protected Door door;

    public DoorState(Door door) {
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public abstract void Close();
    public abstract void Open();
    public abstract void Break();
    public abstract void Lock();
    public abstract void Unlock();

    public void Fix()
    {
        //oor.getDoor() = new DoorClosedState(this);
    }


}
