public enum Level {
    RAW,
    LOW,
    MID,
    HIGH;

    public static Level getLevel(Material material) {
        MaterialType[] high = new MaterialType[] {
            MaterialType.SHAFT,
            MaterialType.COGWHEEL,
            MaterialType.LARGE_COGWHEEL,
            MaterialType.GEARBOX,
            MaterialType.CLUTCH,
            MaterialType.GEARSHIFT,
            MaterialType.ENCASED_CHAIN_DRIVE,
            MaterialType.ADJUSTABLE_CHAIN_GEARSHIFT,
            MaterialType.WATER_WHEEL,
            MaterialType.LARGE_WATER_WHEEL,
            MaterialType.ENCASED_FAN,
            MaterialType.HAND_CRANK,
            MaterialType.MILLSTONE,
            MaterialType.CRUSHING_WHEEL,
            MaterialType.MECHANICAL_PRESS,
            MaterialType.MECHANICAL_MIXER,
            MaterialType.BASIN,
            MaterialType.BLAZE_BURNER,
            MaterialType.DEPOT,
            MaterialType.WEIGHTED_EJECTOR,
            MaterialType.CHUTE,
            MaterialType.SMART_CHUTE,
            MaterialType.FLUID_PIPE,
            MaterialType.MECHANICAL_PUMP,
            MaterialType.SMART_FLUID_PIPE,
            MaterialType.FLUID_VALVE,
            MaterialType.COPPER_VALVE_HANDLE,
            MaterialType.FLUID_TANK,
            MaterialType.HOSE_PULLEY,
            MaterialType.ITEM_DRAIN,
            MaterialType.SPOUT,
            MaterialType.PORTABLE_FLUID_INTERFACE,
            MaterialType.STEAM_ENGINE,
            MaterialType.MECHANICAL_PISTON,
            MaterialType.STICKY_MECHANICAL_PISTON,
            MaterialType.PISTON_EXTENSION_POLE,
            MaterialType.GANTRY_CARRIAGE,
            MaterialType.GANTRY_SHAFT,
            MaterialType.WINDMILL_BEARING,
            MaterialType.MECHANICAL_BEARING,
            MaterialType.CLOCKWORK_BEARING,
            MaterialType.ROPE_PULLEY,
            MaterialType.ELEVATOR_PULLEY,
            MaterialType.CART_ASSEMBLER,
            MaterialType.CONTROLLER_RAIL,
            MaterialType.LINEAR_CHASSIS,
            MaterialType.RADIAL_CHASSIS,
            MaterialType.STICKER,
            MaterialType.CONTRAPTION_CONTROLS,
            MaterialType.MECHANICAL_DRILL,
            MaterialType.MECHANICAL_SAW,
            MaterialType.DEPLOYER,
            MaterialType.PORTABLE_STORAGE_INTERFACE,
            MaterialType.REDSTONE_CONTACT,
            MaterialType.MECHANICAL_HARVESTER,
            MaterialType.MECHANICAL_PLOUGH,
            MaterialType.MECHANICAL_ROLLER,
            MaterialType.WINDMILL_SAIL,
            MaterialType.MECHANICAL_CRAFTER,
            MaterialType.SEQUENCED_GEARSHIFT,
            MaterialType.FLYWHEEL,
            MaterialType.ROTATION_SPEED_CONTROLLER,
            MaterialType.MECHANICAL_ARM,
            MaterialType.TRAIN_TRACK,
            MaterialType.TRAIN_CASING,
            MaterialType.TRAIN_STATION,
            MaterialType.TRAIN_SIGNAL,
            MaterialType.TRAIN_OBSERVER,
            MaterialType.TRAIN_CONTROLS,
            MaterialType.ITEM_VAULT,
            MaterialType.ANDESITE_FUNNEL,
            MaterialType.BRASS_FUNNEL,
            MaterialType.ANDESITE_TUNNEL,
            MaterialType.BRASS_TUNNEL,
            MaterialType.SMART_OBSERVER,
            MaterialType.THRESHOLD_SWITCH,
            MaterialType.DISPLAY_LINK,
            MaterialType.DISPLAY_BOARD,
            MaterialType.NIXIE_TUBE,
            MaterialType.ROSE_QUARTZ_LAMP,
            MaterialType.REDSTONE_LINK,
            MaterialType.ANALOG_LEVER,
            MaterialType.PLACARD,
            MaterialType.PULSE_REPEATER,
            MaterialType.PULSE_EXTENDER,
            MaterialType.POWERED_LATCH,
            MaterialType.POWERED_TOGGLE_LATCH,
            MaterialType.MINECARD_COUPLING,
            MaterialType.MECHANICAL_BELT,
            MaterialType.LIST_FILTER,
            MaterialType.CHEST,
            MaterialType.CAULDRON,
        };
        for (MaterialType t : high) {
            if (material.type.equals(t)) {
                return Level.HIGH;
            }
        }
        
        MaterialType[] mid = new MaterialType[] {
            MaterialType.ANDESITE_CASING,
            MaterialType.PROPELLER,
            MaterialType.ELECTRON_TUBE,
            MaterialType.COPPER_CASING,
            MaterialType.BRASS_CASING,
        };
        for (MaterialType t : mid) {
            if (material.type.equals(t)) {
                return Level.MID;
            }
        }

        MaterialType[] low = new MaterialType[] {
            MaterialType.ANDESITE_ALLOY,
            MaterialType.IRON_BLOCK,
            MaterialType.WHISK,
            MaterialType.IRON_SHEET,
            MaterialType.GOLD_SHEET,
            MaterialType.BRASS_INGOT,
            MaterialType.BRASS_SHEET,
            MaterialType.COPPER_SHEET,
            MaterialType.BARREL,
            MaterialType.DRIED_KELP_BLOCK,
            MaterialType.IRON_BARS,
            MaterialType.COPPER_BLOCK,
            MaterialType.POLISHED_ROSE_QUARTZ,
            MaterialType.ROSE_QUARTZ,
        };
        for (MaterialType t : low) {
            if (material.type.equals(t)) {
                return Level.LOW;
            }
        }

        MaterialType[] raw = new MaterialType[] {
            MaterialType.COPPER_INGOT,
            MaterialType.ANDESITE,
            MaterialType.COBBLESTONE,
            MaterialType.STONE,
            MaterialType.PLANKS,
            MaterialType.WOODEN_SLAB,
            MaterialType.REDSTONE,
            MaterialType.IRON_NUGGET,
            MaterialType.IRON_INGOT,
            MaterialType.NETHERRACK,
            MaterialType.DRIED_KELP,
            MaterialType.SLIME_BALL,
            MaterialType.STRIPPED_LOG,
            MaterialType.GOLD_INGOT,
            MaterialType.ZINC_INGOT,
            MaterialType.QUARTZ,
            MaterialType.WOOL,
            MaterialType.STICK,
            MaterialType.DRIPSTONE,
            MaterialType.PRECISION_MECHANISM,
        };
        for (MaterialType t : raw) {
            if (material.type.equals(t)) {
                return Level.RAW;
            }
        }

        System.out.println("No Level for the MaterialType: " + material.type);
        System.exit(0);
        //never reached
        return Level.RAW;
    }
}
