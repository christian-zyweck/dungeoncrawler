package de.zyweck.dungeon.server.port.inbound

import de.zyweck.dungeon.server.domain.Biome
import de.zyweck.dungeon.server.domain.GameBoard

interface BuildGameBoard {
    fun invoke(biome: Biome): GameBoard
}
