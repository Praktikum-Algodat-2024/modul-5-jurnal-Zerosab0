public class Main{
    public static void main(String[] args) {
        Graph graph = new Graph(17);
        String[] names = {"wh", "zen", "manadium", "tau","emp", "primeval", "psy", 
        "eldwurm", "redox", "rhongo", "curius", "ash", "eva", "unicorn", "Fenrir", "axel", "sol"};
        for (int i = 0; i < names.length; i++) {
            graph.setVertexName(i, names[i]);
        }
        graph.addEdge("wh", "zen", 2);
        graph.addEdge("zen", "manadium", 2);
        graph.addEdge("tau", "sol", 2);
        graph.addEdge("tau", "emp", 4);
        graph.addEdge("emp", "primeval", 5);
        graph.addEdge("psy", "wh", 5);
        graph.addEdge("zen", "eldwurm", 6);
        graph.addEdge("wh", "manadium", 7);
        graph.addEdge("wh", "tau", 7);
        graph.addEdge("psy", "redox", 8);
        graph.addEdge("rhongo", "curius", 8);
        graph.addEdge("wh", "primeval", 8);
        graph.addEdge("ash", "eva", 9);
        graph.addEdge("psy", "curius", 9);
        graph.addEdge("psy", "ash", 9);
        graph.addEdge("axel", "eldwurm", 9);
        graph.addEdge("wh", "sol", 9);
        graph.addEdge("curius", "ash", 10);
        graph.addEdge("unicorn", "primeval", 10);
        graph.addEdge("wh", "redox", 11);
        graph.addEdge("unicorn", "emp", 11);
        graph.addEdge("rhongo", "eva", 11);
        graph.addEdge("Fenrir", "rhongo", 11);
        graph.addEdge("manadium", "eldwurm", 11);
        graph.addEdge("Fenrir", "unicorn", 30);
        graph.addEdge("rhongo", "unicorn", 30);
        graph.addEdge("eva", "emp", 30);
        graph.addEdge("eva", "wh", 30);
        graph.addEdge("ash", "wh", 30);
        graph.addEdge("redox", "zen", 30);
        graph.addEdge("redox", "axel", 30);
        graph.addEdge("sol", "manadium", 30);
        graph.addEdge("wh", "tau", 30);
        graph.addEdge("wh", "axel", 30);
        graph.addEdge("ash", "zen", 30);

        //graph.bfs("psy");
        //graph.dfs("psy");
        System.out.println("eva");
        graph.shortestPath("eva", "ash",null);
        graph.shortestPath("eva", "rhongo",null);
        graph.shortestPath("eva", "psy",null);
        graph.shortestPath("eva", "curius",null);
        graph.shortestPath("eva", "Fenrir",null);
        graph.shortestPath("eva", "wh",null);
        graph.shortestPath("eva", "zen",null);
        graph.shortestPath("eva", "redox",null);
        graph.shortestPath("eva", "manadium",null);
        graph.shortestPath("eva", "tau",null);
        graph.shortestPath("eva", "emp",null);
        graph.shortestPath("eva", "primeval",null);
        graph.shortestPath("eva", "sol",null);
        graph.shortestPath("eva", "eldwurm",null);
        graph.shortestPath("eva", "unicorn",null);
        graph.shortestPath("eva", "axel",null);
        System.out.println();
        System.out.println("\nmanadium");
        graph.shortestPath("manadium", "zen",null);
        graph.shortestPath("manadium", "wh",null);
        graph.shortestPath("manadium", "psy",null);
        graph.shortestPath("manadium", "eldwurm",null);
        graph.shortestPath("manadium", "tau",null);
        graph.shortestPath("manadium", "primeval",null);
        graph.shortestPath("manadium", "sol",null);
        graph.shortestPath("manadium", "redox",null);
        graph.shortestPath("manadium", "emp",null);
        graph.shortestPath("manadium", "axel",null);
        graph.shortestPath("manadium", "ash",null);
        graph.shortestPath("manadium", "curius",null);
        graph.shortestPath("manadium", "unicorn",null);
        graph.shortestPath("manadium", "rhongo",null);
        graph.shortestPath("manadium", "eva",null);
        graph.shortestPath("manadium", "Fenrir",null);

        graph.setTeleportation("Fenrir", "unicorn");
        graph.setTeleportation("Fenrir", "primeval");
        graph.setTeleportation("Fenrir", "emp");
        graph.setTeleportation("Fenrir", "wh");
        graph.setTeleportation("Fenrir", "tau");
        graph.setTeleportation("Fenrir", "sol");
        graph.setTeleportation("Fenrir", "manadium");
        graph.setTeleportation("Fenrir", "eldwurm");
        graph.setTeleportation("Fenrir", "zen");
        graph.setTeleportation("Fenrir", "redox");
        graph.setTeleportation("Fenrir", "axel");

        System.out.println("\nSetelah kendaraan teleportasi ajaib ditaruh di Fenrir\neva");
        graph.shortestPath("eva", "ash",null);
        graph.shortestPath("eva", "rhongo",null);
        graph.shortestPath("eva", "psy",null);
        graph.shortestPath("eva", "curius",null);
        graph.shortestPath("eva", "unicorn",null);
        graph.shortestPath("eva", "primeval",null);
        graph.shortestPath("eva", "emp",null);
        graph.shortestPath("eva", "wh",null);
        graph.shortestPath("eva", "tau",null);
        graph.shortestPath("eva", "sol",null);
        graph.shortestPath("eva", "manadium",null);
        graph.shortestPath("eva", "eldwurm",null);
        graph.shortestPath("eva", "zen",null);
        graph.shortestPath("eva", "redox",null);
        graph.shortestPath("eva", "axel",null);
        graph.removeAllTeleportations();
        System.out.println("\nmanadium\nkendaraan teleportasi dipindahkan ke emp");
        graph.shortestPath("manadium", "zen",null);
        graph.shortestPath("manadium", "wh",null);
        graph.shortestPath("manadium", "psy",null);
        graph.shortestPath("manadium", "eldwurm",null);
        graph.shortestPath("manadium", "tau",null);
        graph.shortestPath("manadium", "primeval",null);
        graph.shortestPath("manadium", "sol",null);
        graph.shortestPath("manadium", "redox",null);
        graph.shortestPath("manadium", "emp",null);
        graph.shortestPath("manadium", "Fenrir",null);
        graph.setTeleportation("emp", "Fenrir");
        graph.setTeleportation("emp", "unicorn");
        graph.setTeleportation("emp", "rhongo");
        graph.setTeleportation("emp", "eva");
        graph.setTeleportation("emp", "curius");
        graph.setTeleportation("emp", "ash");
        graph.setTeleportation("emp", "axel");
        graph.shortestPath("manadium", "Fenrir",null);
        graph.shortestPath("manadium", "unicorn",null);
        graph.shortestPath("manadium", "rhongo",null);
        graph.shortestPath("manadium", "eva",null);
        graph.shortestPath("manadium", "curius",null);
        graph.shortestPath("manadium", "ash",null);
        graph.shortestPath("manadium", "axel",null);
        graph.removeAllTeleportations();
        System.out.println("\nPercobaan dari 16 planet berbeda sebagai titik awal tanpa melibatkan White Hole sebagai planet");
        graph.shortestPath("zen", "manadium", "wh");
        graph.shortestPath("manadium", "tau", "wh");
        graph.shortestPath("tau", "sol", "wh");
        graph.shortestPath("sol", "emp", "wh");
        graph.shortestPath("emp", "primeval", "wh");
        graph.shortestPath("primeval", "psy", "wh");
        graph.shortestPath("psy", "eldwurm", "wh");
        graph.shortestPath("eldwurm", "curius", "wh");
        graph.shortestPath("curius", "ash", "wh");
        graph.shortestPath("ash", "eva", "wh");
        graph.shortestPath("eva", "redox", "wh");
        graph.shortestPath("redox", "sol", "wh");
        graph.shortestPath("axel", "unicorn", "wh");
        graph.shortestPath("unicorn", "rhongo", "wh");
        graph.shortestPath("rhongo", "Fenrir", "wh");

        System.out.println("\nPercobaan dengan teleportation device yang ditambah di 16 planet berbeda");
        graph.setTeleportation("zen", "manadium");
        graph.shortestPath("zen", "manadium", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("manadium", "tau");
        graph.shortestPath("manadium", "tau", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("tau", "sol");
        graph.shortestPath("tau", "sol", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("sol", "emp");
        graph.shortestPath("sol", "emp", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("emp", "primeval");
        graph.shortestPath("emp", "primeval", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("primeval", "psy");
        graph.shortestPath("primeval", "psy", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("psy", "eldwurm");
        graph.shortestPath("psy", "eldwurm", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("eldwurm", "curius");
        graph.shortestPath("eldwurm", "curius", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("curius", "ash");
        graph.shortestPath("curius", "ash", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("ash", "eva");
        graph.shortestPath("ash", "eva", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("eva", "redox");
        graph.shortestPath("eva", "redox", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("redox", "sol");
        graph.shortestPath("redox", "sol", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("sol", "axel");
        graph.shortestPath("sol", "axel", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("axel", "unicorn");
        graph.shortestPath("axel", "unicorn", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("unicorn", "rhongo");
        graph.shortestPath("unicorn", "rhongo", "wh");
        graph.removeAllTeleportations();
        
        graph.setTeleportation("rhongo", "Fenrir");
        graph.shortestPath("rhongo", "Fenrir", "wh");
        graph.removeAllTeleportations();
        
    }
}
