package de.zyweck.dungeon.server.model

import java.util.ArrayDeque

data class GameBoard(
    val biome: Biome,
    val tileStack: ArrayDeque<TileType>,
    val layout: Map<Coordinates, Tile>,
)
