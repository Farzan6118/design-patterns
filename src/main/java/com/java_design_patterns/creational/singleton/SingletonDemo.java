package com.java_design_patterns.creational.singleton;

import com.java_design_patterns.creational.singleton.bill_pugh.BillPughSingleton;
import com.java_design_patterns.creational.singleton.eager_initialization.EagerInitializedSingleton;
import com.java_design_patterns.creational.singleton.enums.EnumSingleton;
import com.java_design_patterns.creational.singleton.lazy_initialization.LazyInitializedSingleton;
import com.java_design_patterns.creational.singleton.static_block.StaticBlockSingleton;
import com.java_design_patterns.creational.singleton.thread_safe.ThreadSafeSingleton;

public class SingletonDemo {

    public static void main(String[] args) {

        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();

        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();

        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton.doSomething();
    }
}
