# Dövüşçü Maç Simülasyonu

Bu Java programı, iki dövüşçü arasında bir maç simüle eder. Program, Fighter sınıfının örneklerini oluşturur ve aralarında bir maç çalıştırır. Her dövüşçünün ad, hasar, sağlık, ağırlık ve kaçış oranı gibi özellikleri vardır.

## Kurulum

- Bilgisayarınızda Java JDK'nın yüklü olduğundan emin olun.
- Bu depoyu klonlayın veya zip dosyası olarak indirin.

## Çalıştırma

- Bir Java derleyicisi veya entegre geliştirme ortamı (IDE) kullanarak projeyi açın.
- Main.java dosyasını bulun ve açın.
- Programı derleyin ve çalıştırın.

## Program Akışı

- Program, ilk dövüşçüyü (f1) ve ikinci dövüşçüyü (f2) temsil eden Fighter sınıfının örneklerini oluşturur.
- İki dövüşçü, bir minimum ağırlık ve bir maksimum ağırlık ile eşleşme (Match) örneği oluşturulur.
- Maç, run() yöntemi çağrılarak çalıştırılır.
- Maçın başlamadan önce, dövüşçülerin ağırlıklarının belirtilen aralıkta olup olmadığını kontrol etmek için bir kontrol yapılır.
- Maçın her bir turunda, dövüşçüler sırayla birbirlerine saldırır. Saldıran rastgele belirlenir.
- Dövüşçülerin sağlık durumu, rakip tarafından verilen hasara bağlı olarak güncellenir. Bir dövüşçü saldırıyı başarıyla kaçırırsa, hiçbir hasar alınmaz.
- Maç, dövüşçülerden birinin sağlığı sıfıra ulaşana kadar devam eder.
- Maçın kazananı, dövüşçülerin kalan sağlık durumuna bağlı olarak belirlenir.

Bu program, iki dövüşçü arasında bir maçı simüle eder. Dövüşçüler birbirlerine sırayla saldırarak birbirlerini yenilene kadar devam eder. Maçın sonuçları ekran üzerinde görüntülenir.

Umarım bu bilgi yardımcı olur. Projelerinizde başarılar dilerim!

# Fighter Match Simulation

This Java program simulates a match between two fighters. The program creates instances of the Fighter class and runs a match between them. Each fighter has attributes such as name, damage, health, weight, and dodge rate.

## Installation

- Make sure you have Java JDK installed on your computer.
- Clone this repository or download it as a zip file.

## How to Run

- Open the project using a Java compiler or an integrated development environment (IDE).
- Locate the Main.java file and open it.
- Compile and run the program.

## Program Flow
The program creates two instances of the Fighter class, representing the first fighter (f1) and the second fighter (f2).
A Match instance is created, passing the two fighters, a minimum weight, and a maximum weight.
The match is executed by calling the run() method.
Before the match begins, a check is performed to ensure that the fighters' weights fall within the specified range.
During each round of the match, the fighters take turns attacking each other. The attacker is determined randomly.
The health of the fighters is updated based on the damage inflicted by the opponent. If a fighter successfully dodges the attack, no damage is taken.
The match continues until one of the fighters' health reaches zero.
The winner of the match is determined based on the remaining health of the fighters.
This program simulates a match between two fighters, where they take turns attacking each other until one of them is defeated. The results of the match are displayed on the screen.

I hope this information is helpful. Good luck with your project!
