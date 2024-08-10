package de.zyweck.dungeon.server.model

data class GameBoard(
    val biome: Biome,
    val tiles: Map<TileConnectorPosition, Tile>,
)
