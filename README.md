# 단일 책임 원칙
객체 지향의 5대 원직인 SOLID의 하나인 단일 책임 원칙(Single Responsibility principle)
하나의 객체는 반드시 하나의 기능만을 수행하는 책임을 갖는다
즉 클래스를 변경하는 이뉴는 오직 하나뿐이여야 한다.
</br>
- SOLD
  - 단일 책임 원칙(Single Responsibility principle)
  - 개방 폐쇄 원칙 (Open Close Principle)
  - 리스코프 치환 원칙 (Liscov Substitution Principle)
  - 인터페이스 분리 원칙 (Interface Sergregation Principle)
  - 의존성 역전 원칙 (Dependency Inversion Principle)

## 단일 책임 원칙을 코드로 알아보기

아래 코드는 단일 책인 원칙의 위배 사례
```
class Animal {
        private var animal = ""

        fun setAnimal(animal: String) {
            this.animal = animal
        }

        fun cry() {
            when(animal){
                "Dog" -> print("멍멍") // 강아지
                "Cat" -> print("야옹") // 고양이
                else -> print("")
            }
        }
    }
```
하나의 메소드에서 두가지 기능을 모두 가지고 있어 단일 책임 원칙을 위반한다.
</br>

아래 코드는 단일 책인 원칙을 지키려고 한 사례
```
interface Animal {
    fun cry()
}

class Dog : Animal {
    override fun cry() {
        println("멍멍")
    }
}

class Cat : Animal {
    override fun cry() {
        print("야옹")
    }
}
```
Animal이라는 인터페이스를 통해서 각각의 동물클래스에서 자신의 울음소리를 구현
