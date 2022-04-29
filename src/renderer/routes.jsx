import ManifestCreation from './views/ManifestCreation';
import ManifestExtraction from './views/DataExtraction';

const routes = [
  {
    path: '/',
    element: <ManifestExtraction />,
    exact: true,
  },
  {
    path: '/manifest-creation',
    element: <ManifestCreation />,
    exact: true,
  },
];

export default routes;
