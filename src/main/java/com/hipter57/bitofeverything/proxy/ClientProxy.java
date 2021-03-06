package com.hipter57.bitofeverything.proxy;

import com.hipter57.bitofeverything.init.ModBlocks;
import com.hipter57.bitofeverything.init.ModItems;
import com.hipter57.bitofeverything.init.ModTools;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
        ModTools.registerRenders();
    }
}
