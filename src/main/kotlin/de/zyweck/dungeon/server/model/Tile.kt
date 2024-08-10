package de.zyweck.dungeon.server.model

data class Tile(
    val type: TileType,
    val connectorPositions: List<TileConnectorPosition>,
)
