public class Minecraft {
    public static void main(String[] args) {
        // Create a new world
        World world = new World();

        // Create a player
        Player player = new Player("Steve");

        // Spawn the player in the world
        world.spawnPlayer(player);

        // Create some blocks
        Block grassBlock = new Block("Grass");
        Block dirtBlock = new Block("Dirt");
        Block stoneBlock = new Block("Stone");

        // Place some blocks in the world
        world.placeBlock(grassBlock, 0, 0, 0);
        world.placeBlock(dirtBlock, 1, 0, 0);
        world.placeBlock(stoneBlock, 2, 0, 0);

        // Print the world
        world.printWorld();
    }
}

class World {
    private Block[][][] blocks;

    public World() {
        this.blocks = new Block[10][10][10]; // Creating a 10x10x10 world
    }

    public void spawnPlayer(Player player) {
        // Spawn the player at position (0, 0, 0)
        player.setPosition(0, 0, 0);
    }

    public void placeBlock(Block block, int x, int y, int z) {
        blocks[x][y][z] = block;
    }

    public void printWorld() {
        // Print the world
        for (int y = 0; y < blocks.length; y++) {
            for (int x = 0; x < blocks[y].length; x++) {
                for (int z = 0; z < blocks[y][x].length; z++) {
                    if (blocks[x][y][z] != null) {
                        System.out.println("Block at (" + x + ", " + y + ", " + z + "): " + blocks[x][y][z].getType());
                    }
                }
            }
        }
    }
}

class Player {
    private String name;
    private int x, y, z;

    public Player(String name) {
        this.name = name;
    }

    public void setPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Block {
    private String type;

    public Block(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
