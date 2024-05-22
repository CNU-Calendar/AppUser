import adapter.LayoutManager
import androidx.compose.runtime.Composable
import device.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    // manager = LocationManager()

    AppTheme {
        LayoutManager()
    }
}