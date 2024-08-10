package de.zyweck.dungeon.server.model

data class Tile(
    val type: TileType,
    val rotation: Rotation,
    val coordinates: Coordinates,
    val effectiveConnectorPositions: List<TileConnectorPosition>,
)
