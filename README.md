# MergeIntervals

## Beschreibung

`MergeIntervals` ist eine Java-Klasse, die dazu dient, überlappende Intervalle in einer Liste von Intervallen zu zusammenzuführen. Diese Funktionalität ist besonders nützlich in Anwendungen, die Zeitfenster oder numerische Bereiche verarbeiten, wie z.B. Kalenderanwendungen oder Systeme zur Ressourcenplanung.

## Funktionsweise

Die Klasse nimmt ein Array von Intervallen entgegen, wobei jedes Intervall durch ein Array von zwei Integer-Werten dargestellt wird. Die Intervalle werden zunächst validiert und sortiert, bevor sie zusammengeführt werden, um eine Liste von nicht überlappenden Intervallen zu erstellen.

## Voraussetzungen

Um `MergeIntervals` zu verwenden, benötigen Sie:
- Java JDK 11 oder höher

## Installation

1. Klonen Sie dieses Repository auf Ihren lokalen Computer:
2. 
git clone [https://github.com/nataliiia11/test-assignment-jobrad.git](https://github.com/nataliiia11/test-assignment-jobrad.git)

3. Wechseln Sie nach dem Klonen in das Projektverzeichnis:
   ```
cd test-assignment-jobrad
   ```
3. Um das Projekt zu bauen, verwenden Sie den folgenden Befehl:
   ```
gradle clean build
   ```
4. Nach dem erfolgreichen Build können Sie das Programm mit folgendem Befehl starten:
   ```
java -jar build/libs/test-assignment-jobrad-1.0-SNAPSHOT.jar
   ```
5. Um die Tests separat auszuführen, verwenden Sie den folgenden Befehl:
   ```
gradle test
   ```
## Verwendung

Hier ist ein einfaches Beispiel, wie Sie die `MergeIntervals`-Klasse verwenden können:

```
public class Main {
public static void main(String[] args) {
MergeIntervals merger = new MergeIntervals();
int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
int[][] merged = merger.merge(intervals);
System.out.println(Arrays.deepToString(merged));
}
}
```

## Mitwirken
Beiträge zu diesem Projekt sind willkommen. Bitte erstellen Sie einen Fork des Repositories und submiten Sie einen Pull Request.

## Lizenz
Dieses Projekt ist unter der MIT Lizenz lizenziert. Details finden Sie in der LICENSE-Datei.

## Ausführungszeit

| Attempt      | #1 | #2 | #3 | #4 | #5 | #6 | #7 | #8 | #9 | #10 |
|--------------|----|----|----|----|----|----|----|----|----|-----|
| Milliseconds | 27 | 17 | 12 | 19 | 13 | 11 | 12 | 18 | 12 | 21  |

Durchschnittszeit: 16 Milliseconds

## Bearbeitungszeit

| Date  | 16.08 | 17.08 | 18.08 | 20.08 | 21.08 |
|-------|-------|-------|-------|-------|-------|
| Hours | 2     | 2     | 1     | 2     | 2     | 

9 Stunden

## Zeitkomplexität

O(n*log(n))

Sortierung der Intervalle O(n*log(n))
Zusammenführen der Intervalle O(n)
Die Laufzeit des Algorithmus mit der Größe der Eingabe n ansteigt, wobei die Sortierung der entscheidende Faktor ist.

# Speicherkomplexität

O(n)
Der Speicherbedarf des Algorithmus linear zur Anzahl der Intervalle in der Eingabe wächst.

Eingabe Array: O(n)
n Intervallen, jedes Intervall aus zwei Ganzzahlen besteht

Sortierung:O(1)
Kein zusätzlicher Speicher für eine Kopie des Arrays benötigt.

Zusammenführen der Intervalle in LinkedList: O(n)

Konvertierung in ein Array: O(n)

## Ideen für die Optimierung der Robustheit

- Optimierung des Algorithmus und Verwendung einer anderen Datenstruktur zBs Trees
- Parallele Verarbeitung
- Fehlerbehandlung
- Monitoring
- Bereinigung der eingehenden Daten
