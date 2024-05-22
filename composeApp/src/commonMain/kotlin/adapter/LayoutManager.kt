package adapter

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.runtime.*
import device.ui.layout.MainLayout


/*
 * TODO: 레이아웃(main,sub등등) 선언(불러오기) 후 레이아웃 간 전환 애니메이션 정의
 */
@Composable
fun LayoutManager() {
    var isMainLayout by remember { mutableStateOf(true) }
    AnimatedVisibility(isMainLayout) {
        MainLayout()
    }
}
