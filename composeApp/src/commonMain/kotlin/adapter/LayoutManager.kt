package adapter

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.*
import device.ui.layout.MainLayout


/*
 * TODO: 레이아웃 여러개 생성 후 레이아웃 간 전환 애니메이션 정의
 */
@Composable
fun LayoutManager() {
    var isMainLayout by remember { mutableStateOf(true) }
    AnimatedVisibility(isMainLayout) {
        MainLayout()
    }
}
