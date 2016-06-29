package com.example.kerry.builder;

/**
 * Created by Kerry on 2016/6/29.
 */
public abstract class Computer {

    protected int mCpuCore = 1;
    protected int mRamSize = 0;
    protected String mOs = "Dos";

    protected Computer() {}

    public abstract void setCPU(int core);
    public abstract void setRAM(int gb);
    public abstract void setOs(String os);

    @Override
    public String toString() {
        return "Computer [mCpuCore=" + mCpuCore + ", mRamSize = " + mRamSize + ", mOs = " + mOs + "]";
    }
    public static class AppleComputer extends Computer {

        protected AppleComputer() {}
        @Override
        public void setCPU(int core) {
            mCpuCore = core;
        }

        @Override
        public void setRAM(int gb) {
            mRamSize = gb;
        }

        @Override
        public void setOs(String os) {
            mOs = os;
        }
    }
}


