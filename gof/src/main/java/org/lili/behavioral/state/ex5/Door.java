package org.lili.behavioral.state.ex5;

/**
 * Created by lili on 2017/7/8.
 */
public class Door extends DomainObject {
    private DoorState _doorState;

    private Device _device;



    public Door(Device _device) {
        this._device = _device;
    }
}
