public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACTGA";
        String dna2 = "ATGCGATAGA";
        String dna3 = "ATGGTAACTGA";

        String dna = dna1; // Variável genérica 

        int length = dna.length(); 
        int inicioIndex = dna.indexOf("ATG");
        int paradaIndex = dna.indexOf("TGA"); 

        if (inicioIndex != -1 && paradaIndex != -1 && (paradaIndex - inicioIndex) % 3 == 0) {
            String proteina = dna.substring(inicioIndex, paradaIndex + 3);
            System.out.println("Contém proteína: " + proteina);
        } else {
            System.out.println("Sem proteína");
        }
    }
}
