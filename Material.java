import java.util.ArrayList;
import java.util.List;

public class Material {
    public MaterialType type;
    public int amount;
    public Level level;

    public Material(MaterialType type, int amount) {
        this.type = type;
        this.amount = amount;
        level = Level.getLevel(this);
    }

    public List<Material> getCraftingMaterials() {
        List<Material> materials = new ArrayList<>();
        int makes = 1;
        switch (type) {
            case SHAFT:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 2));
                makes = 8;
                break;
            case COGWHEEL:
                materials.add(new Material(MaterialType.SHAFT, 1));
                materials.add(new Material(MaterialType.PLANKS, 1));
                break;
            case LARGE_COGWHEEL:
                materials.add(new Material(MaterialType.SHAFT, 1));
                materials.add(new Material(MaterialType.PLANKS, 2));
                break;
            case GEARBOX:
                materials.add(new Material(MaterialType.COGWHEEL, 4));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                break;
            case CLUTCH:
                materials.add(new Material(MaterialType.REDSTONE, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.SHAFT, 1));
                break;
            case GEARSHIFT:
                materials.add(new Material(MaterialType.REDSTONE, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.COGWHEEL, 1));
                break;
            case ENCASED_CHAIN_DRIVE:
                materials.add(new Material(MaterialType.IRON_NUGGET, 3));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                break;
            case ADJUSTABLE_CHAIN_GEARSHIFT:
                materials.add(new Material(MaterialType.ENCASED_CHAIN_DRIVE, 1));
                materials.add(new Material(MaterialType.ELECTRON_TUBE, 1));
                break;
            case WATER_WHEEL:
                materials.add(new Material(MaterialType.SHAFT, 1));
                materials.add(new Material(MaterialType.PLANKS, 8));
                break;
            case LARGE_WATER_WHEEL:
                materials.add(new Material(MaterialType.WATER_WHEEL, 1));
                materials.add(new Material(MaterialType.PLANKS, 8));
                break;
            case ENCASED_FAN:
                materials.add(new Material(MaterialType.SHAFT, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.PROPELLER, 1));
                break;
            case HAND_CRANK:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                materials.add(new Material(MaterialType.PLANKS, 3));
                break;
            case MILLSTONE:
                materials.add(new Material(MaterialType.COGWHEEL, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.ANDESITE, 1));
                break;
            case CRUSHING_WHEEL:
                materials.add(new Material(MaterialType.ANDESITE, 1));
                materials.add(new Material(MaterialType.PLANKS, 4));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 16));
                makes = 2;
                break;
            case MECHANICAL_PRESS:
                materials.add(new Material(MaterialType.SHAFT, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.IRON_BLOCK, 1));
                break;
            case MECHANICAL_MIXER:
                materials.add(new Material(MaterialType.COGWHEEL, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.WHISK, 1));
                break;
            case BASIN:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 5));
                break;
            case BLAZE_BURNER:
                materials.add(new Material(MaterialType.NETHERRACK, 1));
                materials.add(new Material(MaterialType.IRON_SHEET, 4));
                break;
            case DEPOT:
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                break;
            case WEIGHTED_EJECTOR:
                materials.add(new Material(MaterialType.GOLD_SHEET, 1));
                materials.add(new Material(MaterialType.DEPOT, 1));
                materials.add(new Material(MaterialType.COGWHEEL, 1));
                break;
            case CHUTE:
                materials.add(new Material(MaterialType.IRON_INGOT, 1));
                materials.add(new Material(MaterialType.IRON_SHEET, 2));
                makes = 4;
                break;
            case SMART_CHUTE:
                materials.add(new Material(MaterialType.CHUTE, 1));
                materials.add(new Material(MaterialType.BRASS_SHEET, 1));
                materials.add(new Material(MaterialType.ELECTRON_TUBE, 1));
                break;
            case FLUID_PIPE:
                materials.add(new Material(MaterialType.COPPER_INGOT, 1));
                materials.add(new Material(MaterialType.COPPER_SHEET, 2));
                makes = 4;
                break;
            case MECHANICAL_PUMP:
                materials.add(new Material(MaterialType.FLUID_PIPE, 1));
                materials.add(new Material(MaterialType.COGWHEEL, 1));
                break;
            case SMART_FLUID_PIPE:
                materials.add(new Material(MaterialType.BRASS_SHEET, 1));
                materials.add(new Material(MaterialType.FLUID_PIPE, 1));
                materials.add(new Material(MaterialType.ELECTRON_TUBE, 1));
                break;
            case FLUID_VALVE:
                materials.add(new Material(MaterialType.IRON_SHEET, 1));
                materials.add(new Material(MaterialType.FLUID_PIPE, 1));
                break;
            case COPPER_VALVE_HANDLE:
                materials.add(new Material(MaterialType.COPPER_SHEET, 3));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                break;
            case FLUID_TANK:
                materials.add(new Material(MaterialType.COPPER_SHEET, 2));
                materials.add(new Material(MaterialType.BARREL, 1));
                break;
            case HOSE_PULLEY:
                materials.add(new Material(MaterialType.COPPER_CASING, 1));
                materials.add(new Material(MaterialType.DRIED_KELP_BLOCK, 1));
                materials.add(new Material(MaterialType.COPPER_SHEET, 1));
                break;
            case ITEM_DRAIN:
                materials.add(new Material(MaterialType.IRON_BARS, 1));
                materials.add(new Material(MaterialType.COPPER_CASING, 1));
                break;
            case SPOUT:
                materials.add(new Material(MaterialType.COPPER_CASING, 1));
                materials.add(new Material(MaterialType.DRIED_KELP, 1));
                break;
            case PORTABLE_FLUID_INTERFACE:
                materials.add(new Material(MaterialType.COPPER_CASING, 1));
                materials.add(new Material(MaterialType.CHUTE, 1));
                break;
            case STEAM_ENGINE:
                materials.add(new Material(MaterialType.GOLD_SHEET, 1));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                materials.add(new Material(MaterialType.COPPER_BLOCK, 1));
                break;
            case MECHANICAL_PISTON:
                materials.add(new Material(MaterialType.WOODEN_SLAB, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.PISTON_EXTENSION_POLE, 1));
                break;
            case STICKY_MECHANICAL_PISTON:
                materials.add(new Material(MaterialType.MECHANICAL_PISTON, 1));
                materials.add(new Material(MaterialType.SLIME_BALL, 1));
                break;
            case PISTON_EXTENSION_POLE:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 2));
                materials.add(new Material(MaterialType.PLANKS, 2));
                makes = 8;
                break;
            case GANTRY_CARRIAGE:
                materials.add(new Material(MaterialType.WOODEN_SLAB, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.COGWHEEL, 1));
                break;
            case GANTRY_SHAFT:
                materials.add(new Material(MaterialType.REDSTONE, 1));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 2));
                makes = 8;
                break;
            case WINDMILL_BEARING:
                materials.add(new Material(MaterialType.WOODEN_SLAB, 1));
                materials.add(new Material(MaterialType.ANDESITE, 1));
                materials.add(new Material(MaterialType.SHAFT, 1));
                break;
            case MECHANICAL_BEARING:
                materials.add(new Material(MaterialType.WOODEN_SLAB, 1));
                materials.add(new Material(MaterialType.BRASS_CASING, 1));
                materials.add(new Material(MaterialType.ELECTRON_TUBE, 1));
                break;
            case CLOCKWORK_BEARING:
                materials.add(new Material(MaterialType.WOODEN_SLAB, 1));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                materials.add(new Material(MaterialType.SHAFT, 1));
                break;
            case ANDESITE_CASING:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                materials.add(new Material(MaterialType.STRIPPED_LOG, 1));
                break;
            case PROPELLER:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                materials.add(new Material(MaterialType.IRON_SHEET, 4));
                break;
            case ELECTRON_TUBE:
                materials.add(new Material(MaterialType.POLISHED_ROSE_QUARTZ, 1));
                materials.add(new Material(MaterialType.IRON_SHEET, 1));
                break;
            case COPPER_CASING:
                materials.add(new Material(MaterialType.COPPER_INGOT, 1));
                materials.add(new Material(MaterialType.STRIPPED_LOG, 1));
                break;
            case BRASS_CASING:
                materials.add(new Material(MaterialType.BRASS_INGOT, 1));
                materials.add(new Material(MaterialType.STRIPPED_LOG, 1));
                break;
            case ANDESITE_ALLOY:
                materials.add(new Material(MaterialType.IRON_NUGGET, 2));
                materials.add(new Material(MaterialType.ANDESITE, 2));
                break;
            case IRON_BLOCK:
                materials.add(new Material(MaterialType.IRON_INGOT, 9));
                break;
            case WHISK:
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 2));
                materials.add(new Material(MaterialType.IRON_SHEET, 5));
                break;
            case IRON_SHEET:
                materials.add(new Material(MaterialType.IRON_INGOT, 1));
                break;
            case GOLD_SHEET:
                materials.add(new Material(MaterialType.GOLD_INGOT, 1));
                break;
            case BRASS_SHEET:
                materials.add(new Material(MaterialType.BRASS_INGOT, 1));
                break;
            case COPPER_SHEET:
                materials.add(new Material(MaterialType.COPPER_INGOT, 1));
                break;
            case BRASS_INGOT:
                materials.add(new Material(MaterialType.ZINC_INGOT, 1));
                materials.add(new Material(MaterialType.COPPER_INGOT, 1));
                makes = 2;
                break;
            case BARREL:
                materials.add(new Material(MaterialType.PLANKS, 6));
                materials.add(new Material(MaterialType.WOODEN_SLAB, 2));
                break;
            case DRIED_KELP_BLOCK:
                materials.add(new Material(MaterialType.DRIED_KELP, 9));
                break;
            case IRON_BARS:
                materials.add(new Material(MaterialType.IRON_INGOT, 6));
                makes = 16;
                break;
            case COPPER_BLOCK:
                materials.add(new Material(MaterialType.COPPER_INGOT, 9));
                break;
            case POLISHED_ROSE_QUARTZ:
                materials.add(new Material(MaterialType.ROSE_QUARTZ, 1));
                break;
            case ROSE_QUARTZ:
                materials.add(new Material(MaterialType.REDSTONE, 8));
                materials.add(new Material(MaterialType.QUARTZ, 1));
                break;
            case WINDMILL_SAIL:
                materials.add(new Material(MaterialType.WOOL, 1));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                materials.add(new Material(MaterialType.STICK, 2));
                makes = 2;
                break;
            case MECHANICAL_BELT:
                materials.add(new Material(MaterialType.DRIED_KELP, 6));
                break;
            case LIST_FILTER:
                materials.add(new Material(MaterialType.IRON_NUGGET, 2));
                materials.add(new Material(MaterialType.WOOL, 1));
                break;
            case CHEST:
                materials.add(new Material(MaterialType.PLANKS, 8));
                break;
            case CAULDRON:
                materials.add(new Material(MaterialType.IRON_INGOT, 7));
                break;
            case MECHANICAL_DRILL:
                materials.add(new Material(MaterialType.IRON_INGOT, 1));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 3));
                materials.add(new Material(MaterialType.ANDESITE_CASING, 1));
                break;
            case ROTATION_SPEED_CONTROLLER:
                materials.add(new Material(MaterialType.BRASS_CASING, 1));
                materials.add(new Material(MaterialType.PRECISION_MECHANISM, 1));
                break;
            case ANDESITE_FUNNEL:
                materials.add(new Material(MaterialType.DRIED_KELP, 1));
                materials.add(new Material(MaterialType.ANDESITE_ALLOY, 1));
                makes = 2;
                break;
            case BRASS_FUNNEL:
                materials.add(new Material(MaterialType.DRIED_KELP, 1));
                materials.add(new Material(MaterialType.BRASS_INGOT, 1));
                materials.add(new Material(MaterialType.ELECTRON_TUBE, 1));
                makes = 2;
                break;
            case BRASS_TUNNEL:
                materials.add(new Material(MaterialType.DRIED_KELP, 2));
                materials.add(new Material(MaterialType.BRASS_INGOT, 2));
                materials.add(new Material(MaterialType.ELECTRON_TUBE, 1));
                makes = 2;
                break;
            default:
                throw new RuntimeException("Crafting Recipe not found: " + type);
        }
        return multiplyByAmount(materials, makes);
    }

    private List<Material> multiplyByAmount(List<Material> materials, int makes) {
        int multiplyTimes = amount / makes;
        if (amount % makes != 0) {
            multiplyTimes++;
        }

        for (int i = 0; i < materials.size(); i++) {
            materials.get(i).amount = materials.get(i).amount * multiplyTimes;
        }
        return materials;
    }

    public String toString() {
        String s = "";
        if (amount / 64 == 0) {
            s += amount;
        } else {
            s += amount / 64;
            s += " Stacks & ";
            s += amount % 64;
        }

        return s + " " + type.toString();
    }

    public Material clone() {
        return new Material(type, amount);
    }

    public static List<Material> combine(List<Material> materials) {
        List<Material> result = new ArrayList<>();
        for (int i = 0; i < materials.size(); i++) {
            result.add(materials.get(i).clone());
            for (int j = 0; j < materials.size(); j++) {
                if (materials.get(i).type.equals(materials.get(j).type) && i != j) {
                    result.get(i).amount += materials.get(j).amount;
                    materials.remove(j--);
                }
            }
        }
        return result;
    }
}