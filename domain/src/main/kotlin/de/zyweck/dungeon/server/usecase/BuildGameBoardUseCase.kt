package de.zyweck.dungeon.server.usecase

import de.zyweck.dungeon.server.domain.Biome
import de.zyweck.dungeon.server.domain.Coordinates
import de.zyweck.dungeon.server.domain.GameBoard
import de.zyweck.dungeon.server.domain.Tile
import de.zyweck.dungeon.server.domain.TileType
import de.zyweck.dungeon.server.domain.TileType.START
import de.zyweck.dungeon.server.port.inbound.BuildGameBoard
import java.util.ArrayDeque

class BuildGameBoardUseCase : BuildGameBoard {
    private val startTile =
        Tile(
            type = START,
            connectorPositions = START.tileConnectorPositions,
        )

    override fun invoke(biome: Biome): GameBoard =
        GameBoard(
            biome = biome,
            layout = initializeLayout(),
            tileStack = initializeStack(),
        )

    private fun initializeLayout() = mutableMapOf(Coordinates(x = 0, y = 0) to startTile)

    private fun initializeStack(): ArrayDeque<TileType> {
        val stackAsList = mutableListOf<TileType>()
        TileType.entries.filter { it != START }.forEach { tileType ->
            stackAsList.addAll(
                List(tileType.initialCountInStack) {
                    tileType
                },
            )
        }
        stackAsList.shuffle()
        return ArrayDeque(stackAsList)
    }
}
