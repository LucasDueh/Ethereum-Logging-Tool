import ManifestCreation from './views/ManifestCreation';
import DataExtraction from './views/DataExtraction';
import Home from './views/Home';

const routes = [
  {
    path: '/',
    element: <Home />,
    exact: true,
  },
  {
    path: '/data-extraction',
    element: <DataExtraction />,
    exact: true,
  },
  {
    path: '/manifest-creation',
    element: <ManifestCreation />,
    exact: true,
  },
];

export default routes;
