package de.zyweck.dungeon.server.domain

import java.util.ArrayDeque

data class GameBoard(
    val biome: Biome,
    val tileStack: ArrayDeque<TileType>,
    val layout: Map<Coordinates, Tile>,
)
