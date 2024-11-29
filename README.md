# LAN Message Plugin

A simple PaperMC plugin that sends a custom MiniMessage-formatted welcome message to players when they join the server, but **only if they are connecting from a LAN (Local Area Network).**

This plugin was created to share a web browser map that is only available on LAN, ensuring that only players who can access it will receive the link.

---

## Features
- Sends a personalized welcome message to LAN players.
- Supports advanced text formatting and interactivity using [Adventure's MiniMessage](https://docs.adventure.kyori.net/minimessage/format.html).
- Configurable message in the `config.yml`.

---

## Requirements
- Minecraft server running **PaperMC**.
- Java 17 or later.
- Adventure library (already included in PaperMC).

---

## Installation
1. Download the latest release of the plugin from the [Releases](https://github.com/Artificial-720/LanJoinMessage/releases) page.
2. Place the `LanJoinMessage-1.x.x.jar` file into your server's `plugins/` directory.
3. Start the server to generate the `config.yml` file.
4. Edit the `config.yml` file to customize your welcome message. Use MiniMessage formatting for colors, hover text, and more.

---

## Configuration

The plugin generates a `config.yml` file on first run. You can define the LAN-only welcome message here:

```yaml
# MiniMessage-formatted welcome message for LAN players.
lan-message: "<green>Welcome to the <bold>LAN Server</bold>! <hover:show_text:'Enjoy your stay!'><click:open_url:'https://example.com'>[Click here]</click></hover>"
```
