package com.example.kerry.builder;

/**
 * Created by Kerry on 2016/6/29.
 */
public abstract class Builder {

    public abstract void buildCPU(int core);
    public abstract void buildRAM(int gb);
    public abstract void buildOs(String os);

    public abstract Computer create();

    public static class ApplePCBuilder extends Builder {
        private Computer mApplePc = new Computer.AppleComputer();

        @Override
        public void buildCPU(int core) {
            mApplePc.setCPU(core);
        }

        @Override
        public void buildRAM(int gb) {
            mApplePc.setRAM(gb);
        }

        @Override
        public void buildOs(String os) {
            mApplePc.setOs(os);
        }

        @Override
        public Computer create() {
            return mApplePc;
        }
    }
}
