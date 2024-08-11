package de.zyweck.dungeon.server.domain

data class Tile(
    val type: TileType,
    val connectorPositions: List<TileConnectorPosition>,
)
