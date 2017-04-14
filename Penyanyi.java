class Penyanyi {
public void bernyanyi ( ) {
System.out.println("Karakteristik nadanya" + "belum didefinisikan");
}
public static void main (String[] args) {
Penyanyi p;

PenyanyiJazz musmujiono = new PenyanyiJazz ( );
PenyanyiPop audi = new PenyanyiPop ( );
PenyanyiDangdut inul = new PenyanyiDangdut ( );

p = musmujiono;
p.bernyanyi ( );
p = audi;
p.bernyanyi ( );
p = inul;
p.bernyanyi ( );
}
}

class PenyanyiJazz extends Penyanyi {
@Override
public void bernyanyi ( ) {
System.out.println("Bernyanyi dengan irama Jazz");
}
}

class PenyanyiPop extends Penyanyi {
@Override
public void bernyanyi ( ) {
System.out.println("Bernyanyi dengan irama Pop");
}
}

class PenyanyiDangdut extends Penyanyi {
@Override
public void bernyanyi ( ) {
System.out.println("Bernyanyi dengan irama Dangdut");
}
}
