package bronze.purple.chapter7;

class SuperA {
    final class SuperB { }
    class SuperC { void print( ){} }
    class SuperD { final void print(){} }

    class SubA extends SuperA { }
//    class SubB extends SuperB { }
    class SubC extends SuperC { void print(){} }
//    class SubD extends SuperD { void print(){} }

}
public class Sample7_3 {
}
