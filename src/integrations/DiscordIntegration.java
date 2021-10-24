package integrations;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

class DiscordIntegration {
  public void DiscordRPC() {
    DiscordRPC discord = DiscordRPC.INSTANCE;
    String applicationID = "901877568884588624";
    String streamID = "";

    DiscordEventHandlers handlers = new DiscordEventHandlers();
    discord.Discord_Initialize(applicationID, handlers, true, streamID);

    DiscordRichPresence presence = new DiscordRichPresence();
    presence.startTimestamp = System.currentTimeMillis() / 1000;
    presence.largeImageKey = "icon_commando";
    presence.largeImageText = "Commando";
    presence.smallImageKey = "console";
    presence.smallImageText = "in-game";
    presence.details = "Commando";
    presence.state = "version: 0.1.2";

    discord.Discord_UpdatePresence(presence);
  }
}