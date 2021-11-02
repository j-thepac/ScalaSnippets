package Advanced




object GenericTest extends App{

  sealed class A
  sealed class B extends A
  sealed class C extends B
  sealed class G[T>:B](val a:T){def fn(a:T)=println("hi")}
  sealed class H[+T]{def fn[T>:A](a:T)=println("hi")}

val g:G[B]=new G(new B())
  g.fn(new B())
}
