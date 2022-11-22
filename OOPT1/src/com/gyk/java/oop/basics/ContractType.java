package com.gyk.java.oop.basics;

public enum ContractType    {
        FULL_TIME("Full-Time"),
        PART_TIME(" Part-Time");

        public final String label;

       ContractType(String label){
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
}
