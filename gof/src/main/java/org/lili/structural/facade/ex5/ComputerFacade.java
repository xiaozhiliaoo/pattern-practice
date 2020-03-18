package org.lili.structural.facade.ex5;

/**
 * Created by lili on 2017/7/11.
 */
public class ComputerFacade {
    private static final long BOOT_ADDRESS = 1L;
    private static final long BOOT_SECTOR = 1L;
    private static final int SECTOR_SIZE = 1;
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start(){
        processor.freeze();
        ram.load(BOOT_ADDRESS,hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
    
    public void end(){
        
    }
    
    public void extendRam(){
        
    }
}
