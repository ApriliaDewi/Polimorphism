class Mobil{
private String warna;
private int tahunProduksi;

public Mobil (String warna, int tahunProduksi){
this.warna = warna;
this.tahunProduksi = tahunProduksi;
}

public void info ( ){
System.out.println("Warna : " + this.warna);
System.out.println("Tahun : " + this.tahunProduksi);
}

public static void main(String[] args){
Mobil mobilku = new Mobil("Putih", 2003);

mobilku.info ( );
}
}