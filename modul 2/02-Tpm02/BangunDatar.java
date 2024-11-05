public class BangunDatar {
    // Attributes
    private double panjang;
    private double lebar;

    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }      

    // Getter methods
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    // Setter methods
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }  

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method to calculate area
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method to calculate perimeter
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method to print the result
    public void cetakHasil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    // Additional methods to print individual attributes
    public void cetakPanjang() {
        System.out.println("Panjang: " + panjang);
    }

    public void cetakLebar() {
        System.out.println("Lebar: " + lebar);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example of creating an object
        BangunDatar persegiPanjang = new BangunDatar(12, 5);

        // Print details
        persegiPanjang.cetakHasil();
    }
}
