package practice4.z2;

public class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.S, 1500, "белая"),
                new TShirt(Size.M, 1800, "черная"),
                new Pants(Size.L, 3500, "синие"),
                new Pants(Size.XS, 2900, "серые"),
                new Skirt(Size.S, 2500, "красная"),
                new Skirt(Size.XXS, 1200, "розовая"),
                new Tie(Size.M, 900, "бордовый"),
                new Tie(Size.L, 1100, "черный")
        };

        Atelier.dressWomen(clothes);
        Atelier.dressMan(clothes);
    }
}
