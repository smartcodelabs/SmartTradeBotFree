# SmartTradeBotFree

Ein Minecraft Forge Mod für automatisierten Handel.

## Releases

Die fertigen Mod-Dateien (.jar) werden automatisch über GitHub Releases bereitgestellt.

### Download

Besuchen Sie die [Releases-Seite](https://github.com/smartcodelabs/SmartTradeBotFree/releases), um die neueste Version herunterzuladen.

### Installation

1. Laden Sie die neueste .jar Datei von der Releases-Seite herunter
2. Platzieren Sie die Datei in Ihrem Minecraft `mods` Ordner
3. Starten Sie Minecraft mit Forge 1.19.2

## Entwicklung

### Voraussetzungen

- Java 17 oder höher
- Minecraft Forge 1.19.2

### Bauen

```bash
./gradlew build
```

Die fertige Mod-Datei finden Sie dann unter `build/libs/`.

### Release erstellen

Um ein neues Release zu erstellen, erstellen Sie einen Git-Tag:

```bash
git tag v1.0.0
git push origin v1.0.0
```

Dies löst automatisch den Build-Prozess aus und erstellt ein GitHub Release mit der fertigen Mod-Datei.

## Lizenz

Siehe LICENSE Datei für Details.