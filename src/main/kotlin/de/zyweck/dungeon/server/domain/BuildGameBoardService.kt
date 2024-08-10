package de.zyweck.dungeon.server.domain

import de.zyweck.dungeon.server.model.Biome
import de.zyweck.dungeon.server.model.Coordinates
import de.zyweck.dungeon.server.model.GameBoard
import de.zyweck.dungeon.server.model.Tile
import de.zyweck.dungeon.server.model.TileType
import de.zyweck.dungeon.server.model.TileType.START
import org.springframework.stereotype.Service
import java.util.ArrayDeque

@Service
class BuildGameBoardService {
    private val startTile =
        Tile(
            type = START,
            connectorPositions = START.tileConnectorPositions,
        )

    fun execute(biome: Biome = randomBiome()): GameBoard =
        GameBoard(
            biome = biome,
            layout = initializeLayout(),
            tileStack = initializeStack(),
        )

    private fun randomBiome() = Biome.entries.toTypedArray().random()

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
